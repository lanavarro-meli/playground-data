package br.dh.meli.springdatai.service;

import br.dh.meli.springdatai.model.UserModel;
import org.apache.catalina.User;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface IUserService{
   UserModel getUserById(long id);
   UserModel insertUser(UserModel user);
   UserModel updateUser(UserModel user);
   //UserModel updateModelPartial(long id, Map<String, String > changes);
   UserModel updateModelPartial(long id, Map<String, String> changes);
   void deleteUser(long id);
   List<UserModel> listAll();
   UserModel findByEmail(String email);

}
