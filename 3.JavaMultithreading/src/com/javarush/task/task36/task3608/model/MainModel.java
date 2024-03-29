package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.model.service.UserService;
import com.javarush.task.task36.task3608.model.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class MainModel implements Model {
    private ModelData modelData = new ModelData();
    private UserService userService = new UserServiceImpl();

    @Override
    public ModelData getModelData() {
         return modelData;
    }

    @Override
    public void loadUsers() {
        //modelData.setUsers(userService.getUsersBetweenLevels(1,100));
        modelData.setDisplayDeletedUserList(false);
        modelData.setUsers(getAllUsers());
    }

    public void loadDeletedUsers(){
        List<User> users = userService.getAllDeletedUsers();
        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(true);
    }

    @Override
    public void loadUserById(long userId) {
        User user = userService.getUsersById(userId);
        modelData.setActiveUser(user);


    }

    @Override
    public void deleteUserById(long id) {
//        User user = userService.deleteUser(id);
//        modelData.setActiveUser(user);

        userService.deleteUser(id);
        loadUsers();
    }
    public void changeUserData(String name, long id, int level){
        userService.createOrUpdateUser(name, id, level);
       // modelData.setUsers(getAllUsers());
        loadUsers();
    }
    private List<User> getAllUsers(){
        return userService.filterOnlyActiveUsers(userService.getUsersBetweenLevels(1,100));
    }

}
