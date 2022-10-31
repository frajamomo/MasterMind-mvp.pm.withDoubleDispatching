package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Result;

class ResultView {
    
    private Result result;

    ResultView(Result result) {
        this.result = result;
    }

    void writeln() {
        Message.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
    }
}