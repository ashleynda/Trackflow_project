package data.repositories;

import data.models.UserProfile;

public interface UserProfileRepository {

    UserProfile save(UserProfile userProfile);
    void delete(UserProfile userProfile);
    UserProfile findById(int id);
    Iterable <UserProfile> findAll();
    long count();
    void clear();

}
