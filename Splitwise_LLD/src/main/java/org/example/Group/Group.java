package org.example.Group;

import org.example.User.User;
import org.example.Expense.Expense;
import org.example.Expense.ExpenseController;

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
