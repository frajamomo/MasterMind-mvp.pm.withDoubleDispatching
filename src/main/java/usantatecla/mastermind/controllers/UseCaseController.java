package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.State;

import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.Result;
import usantatecla.mastermind.models.SecretCombination;

public abstract class UseCaseController {
    
    protected Game game;
    protected State state;

    UseCaseController(Game game, State state){
        this.game = game;
        this.state = state;
    }

	public ProposedCombination getProposedCombination(int position) {
        return this.game.getProposedCombination(position);
	}

	public int getAttempts() {
        return this.game.getAttempts();
    }
    
    public SecretCombination getSecretCombination(){
        return this.game.getSecretCombination();
    }

    public Result getResult(int position) {
        return this.game.getResult(position);
    }

    public void next() {
        this.state.next();
    }

    public abstract void accept(ControllerVisitor controllerVisitor);

}
