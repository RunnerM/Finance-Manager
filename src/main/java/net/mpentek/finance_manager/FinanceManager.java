package net.mpentek.finance_manager;

import javafx.application.Application;
import javafx.stage.Stage;
import net.mpentek.finance_manager.app.model.UIModel;
import net.mpentek.finance_manager.app.model.UIModelManager;
import net.mpentek.finance_manager.app.view.ViewHandler;
import net.mpentek.finance_manager.app.viewmodel.ViewModelFactory;

public class FinanceManager extends Application
{
    public void start(Stage primaryStage)
    {
        UIModel model = new UIModelManager();
        ViewModelFactory viewModelFactory = new ViewModelFactory(model);
        ViewHandler view = new ViewHandler(viewModelFactory);
        view.start(primaryStage);
    }

}
