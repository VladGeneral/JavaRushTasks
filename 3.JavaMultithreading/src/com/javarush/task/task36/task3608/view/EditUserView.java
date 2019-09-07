package com.javarush.task.task36.task3608.view;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;

public class EditUserView implements View{
    private Controller controller;
    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void refresh(ModelData modelData) {
        System.out.println("User to be edited:");
        System.out.println("\t" + modelData.getActiveUser());
//        for (int i = 0; i <modelData.getUsers().size() ; i++) {
//            System.out.println("\t" + modelData.getUsers().get(i));
//        }
//        System.out.println("===================================================");
//        for (User user : modelData.getUsers()) {
//            System.out.println("\t" + user);
//        }
        System.out.println("===================================================");
    }
    public void fireEventUserDeleted(long id){
        controller.onUserDelete(id);
    }
    public void fireEventUserChanged(String name, long id, int level){
        controller.onUserChange(name, id, level);
    }
}
