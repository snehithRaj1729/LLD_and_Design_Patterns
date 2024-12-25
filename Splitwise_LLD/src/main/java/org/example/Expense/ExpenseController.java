package org.example.Expense;

import org.example.Expense.Split.ExpenseSplit;
import org.example.Expense.Split.Split;

import java.util.List;

public class ExpenseController {
    BalanceSheetController balanceSheetController;

    public ExpenseController() {
        this.balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount, List<Split> splitDetails, ExpenseSplitType expenseSplitType, User paidByUser){
        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(expenseSplitType);
        expenseSplit.validateSplitRequest(splitDetails,expenseAmount);
        Expense expense = new Expense(expenseId,description,expenseAmount,paidByUser,expenseSplitType,splitDetails);
        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser,splitDetails,expenseAmount);
        return expense;
    }
}
