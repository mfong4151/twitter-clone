package com.mfong.tweetr.user;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


@Service
public class UserService {

  private final UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository){
	this.userRepository = userRepository;
  }
  
  public List<User> getUsers(){
		return userRepository.findAll();
	} 

  public void addNewUser(User user){
    Optional<User> userById = userRepository.findUserById(user.getId());
    
    if (userById.isPresent()){
      throw new IllegalStateException("This not ok");
    }
    userRepository.save(user);
  
  }

  @Transactional
  public void updateUser(Long userId){
    
  }

  public void deleteUser(Long userId){

    boolean exists = userRepository.existsById(userId);
    if(!exists){
      throw new IllegalStateException("userId does not exist");
    }
    userRepository.deleteById(userId);


  }
}
