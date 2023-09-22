package services;

import data.models.UserProfile;
import data.repositories.UserProfileRepository;
import data.repositories.UserProfileRepositoryImpl;

import java.util.Objects;

public class UserProfileService {

    UserProfileRepository userProfileRepository = new UserProfileRepositoryImpl();

    public void register(String firstName, String lastName, int age, String password) {
        UserProfile userProfile = new UserProfile();
        userProfile.setFirstName(firstName);
        userProfile.setLastName(lastName);
        userProfile.setAge(age);
        userProfile.setPassword(password);
        userProfileRepository.save(UserProfile);
    }

    public UserProfile findUser(int id){
        return userProfileRepository.findById(id);
    }
    public void delete(int id){
        userProfileRepository.delete(findUser(id));
    }
    public void clear() {
        userProfileRepository.clear();
    }
    public boolean validation(String firstName, String lastName, String password){
        UserProfile userProfile = userProfileRepository.findByUsername(firstName + " " + lastName);
        if (Objects.equals(userProfile.getPassword(),password)){
            return true;
        }
        return false;
    }
}

