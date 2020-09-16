package dodemo.first;

import definition_annotation.Autowired;

public class Operating {
    @Autowired
    User user;

    public void showName() {
        System.out.println("-username-----" + user.getName());
    }
}
