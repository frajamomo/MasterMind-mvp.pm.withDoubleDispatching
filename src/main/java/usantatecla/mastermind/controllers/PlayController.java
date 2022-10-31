package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.State;

import usantatecla.mastermind.models.ProposedCombination;

public class PlayController extends UseCaseController {

    public PlayController(Game game, State state) {
        super(game, state);
    }

    public int getAttempts(){
        return this.game.getAttempts();
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.game.addProposedCombination(proposedCombination);
    }

    public boolean isWinner() {
        Boolean isWinner = this.game.isWinner();
        if (isWinner) {
            this.state.next();
        }
        return isWinner;
    }

    public boolean isLooser() {
        Boolean isLooser = this.game.isLooser();
        if (isLooser) {
            this.state.next();
        }
        return isLooser;
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}