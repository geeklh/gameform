class GroupRect extends egret.Sprite{
    public constructor() {
        super();
        this.createRect();
    }
    private _rects:Array<Rect>;
    private createRect()
    {
        this._rects = [];
        for(var i = 0 ;i < 4; i++){
            var rect:Rect = new Rect();
            this._rects.push( rect );
            rect.x = rect.width * i;
            this.addChild( rect );
            rect.addEventListener( egret.TouchEvent.TOUCH_TAP, this.onClickRect, this );
        }
    }

    private _currentRow:number = 0;
    private onClickRect(evt:egret.TouchEvent){
        evt.target.onRectClick();
        if( evt.target.type == RectType.NONCLICKABLE || this._currentRow != (Data.getRectRow() - 2 ) ){
            this.dispatchEventWith("GameOver");
        }
        else {
            this.dispatchEventWith("ClickRight");
        }
    }

    private _currentBlackindex:number = 0;
    public createBlackRect() {
        var n:number = Math.random();
        if( n>=0 && n<0.25 ) {
            this._currentBlackindex = 0;
        }
        else if( n>=0.25 && n<0.5 ){
            this._currentBlackindex = 1;
        }
        else if( n>=0.5 && n<0.75 ){
            this._currentBlackindex = 2;
        }
        else if( n>=0.75 && n<1 ) {
            this._currentBlackindex = 3;
        }
        this._rects[this._currentBlackindex].type  =RectType.CLICKABLE;
    }

    // 初始化
    public init(){
        for(var i = 0;i < 4; i++){
            this._rects[i].type = RectType.NONCLICKABLE;
        }
    }
    public move(){
        this._currentRow++;
        if( this._currentRow == Data.getRectRow()) {
            this._currentRow = 0;
            this.createBlackRect();
        }
        this.y = this._currentRow * Data.getRectWidth();
    }
}