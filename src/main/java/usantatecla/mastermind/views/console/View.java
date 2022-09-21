package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.UseCaseController;
import usantatecla.mastermind.controllers.ControllerVisitor;
import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.controllers.StartController;

public class View extends usantatecla.mastermind.views.View implements ControllerVisitor{

    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;

    public View(){
        this.startView = new StartView();
        this.playView = new PlayView();
        this.resumeView = new ResumeView();
    }

    @Override
    public void interact(UseCaseController controller) {
        controller.accept(this);
    }

    @Override
    public void visit (StartController startController) {
        this.startView.interact(startController);
    }
    @Override
    public void visit (PlayController playController) {
        this.playView.interact(playController);
    }
    @Override
    public void visit (ResumeController resumeController) {
        this.resumeView.interact(resumeController);
    }




}
