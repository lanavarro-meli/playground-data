package br.dh.meli.springdatai.repository;

import br.dh.meli.springdatai.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserModel,Long> {
    UserModel findByEmail(String email);


}
