package Group;

import Expense.*;
import User.User;

import java.util.ArrayList;
import java.util.List;

public class Group {
    String groupId;
    String groupName;
    List<Expense> expenseList;
    ExpenseController expenseController;
    List<User> groupMembers;

    public Group() {
        groupMembers = new ArrayList<>();
        expenseList = new ArrayList<>();
        expenseController = new ExpenseController();
    }
}
