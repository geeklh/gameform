class Game {
    private _root:egret.DisplayObjectContainer;
    public constructor( root:egret.DisplayObjectContainer ) {
        this._root = root;
        this.createGroupRect();
        this.creatTimer();
        this.startGame();
    }

    private _row:number;
    private _rectRoot:egret.Sprite;
    private _rectGroup:Array<GroupRect>;
    private createGroupRect()
    {
        this._rectRoot = new egret.Sprite();
        this._root.addChild( this._rectRoot );
        this._rectGroup = [];
        this._row = Data.getRectRow();

        var groupRect:GroupRect;
        for(var i = 0;i<this._row; i++ ){
            groupRect = new GroupRect();
            groupRect.addEventListener("gameOver", this.gameOver, this);
            groupRect.addEventListener("clickRight", this.nextRow, this);
            this._rectGroup.push( groupRect );
            groupRect.y = Data.getRectWidth();
            this._rectRoot.addChild( groupRect )
        }
        this._rectRoot.y = Data.getStageHeight() - this._rectRoot.height;
    }

    private nextRow(){
        for(var i = 0;i < this._row; i++ ){
            this._rectGroup[i].move();
        }
        Data.score++;
    }

    private gameOverPanel:GameOverPanel;
    private gameOver(){
        this._timerPanel.stop();
        if( !this.gameOverPanel ){
            this.gameOverPanel = new GameOverPanel();
            this.gameOverPanel.addEventListener("startGame", this.startGame, this);
        }
        this._root.addChild( this.gameOverPanel )
    }

    private _timerPanel:TimerPanel;
    private creatTimer(){
        this._timerPanel = new TimerPanel();
        this._timerPanel.addEventListener("gameOver", this.gameOver, this);
        this._root.addChild( this._timerPanel );
    }

    private startGame(){
        Data.score = 0;
        for( var i = 0; i<this._row;i++){
            this._rectGroup[i].init();
            this._rectGroup[i].y = Data.getRectWidth() * i;
            this._rectGroup[i]._currentRow= i;
            if( i != (this._row-1) ){
                this._rectGroup[i].createBlackRect();
            }
        }
        this._timerPanel.start();
    }

}