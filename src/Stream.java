

import java.util.ArrayList;
import java.util.List;

public class Stream {

    public static void main(String[] args) {
        List<User> list=new ArrayList<>();
        User user=new User();
        User u=new User();
        u.setName("a");
        u.setAge("0");
        user.setName("b");
     list.add(u);
     list.add(user);

        list.stream().filter(a->a.getAge()!=null).forEach(a->a.setAge("2"));
        list.stream().filter(a->a.getAge()==null).forEach(a->a.setAge("1"));

        System.out.println(list.size());
    }
}

