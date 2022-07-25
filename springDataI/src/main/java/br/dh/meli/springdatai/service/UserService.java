package br.dh.meli.springdatai.service;

import br.dh.meli.springdatai.exception.BadRequestException;
import br.dh.meli.springdatai.exception.UserNotFoundException;
import br.dh.meli.springdatai.model.UserModel;
import br.dh.meli.springdatai.repository.IUserRepository;
import org.apache.catalina.User;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository repo;
    @Autowired
    private ModelMapper mapper;


    @Override
    public UserModel getUserById(long id){
        return repo.findById(id).orElseThrow(()-> new UserNotFoundException("Usuário não encontrado. id: " + id));
    }

    @Override
    public UserModel insertUser(UserModel user) {
        if(user.getId() > 0) throw new BadRequestException("Nåo é possivel inserir um usuario existente");
        return repo.save(user);


    }

    @Override
    public UserModel updateUser(UserModel user) {
        return repo.save(user);
    }

    @Override
    public UserModel updateModelPartial(long id,Map<String, String> changes) {
        UserModel userFound = getUserById(id);
        changes.forEach( (a,v) -> {
            switch (a){
                case "name": userFound.setName(v);
                case "email": userFound.setEmail(v);
            }
        });


        return repo.save(userFound);
    }

//    @Override
//    public UserModel updateModelPartial(long id,Object changes) {
//        UserModel userFound = getUserById(id);
//        UserModel userConvert = mapper.map(changes, UserModel.class);
//
//
//        return repo.save(userConvert);
//    }

    @Override
    public void deleteUser(long id) {
        UserModel userFound = getUserById(id);
        repo.deleteById(userFound.getId());


    }

    @Override
    public List<UserModel> listAll() {
        return repo.findAll();
    }

    @Override
    public UserModel findByEmail(String email) {
        return repo.findByEmail(email);
    }
}
