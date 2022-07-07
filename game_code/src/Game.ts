class Game {
    private _root:egret.DisplayObjectContainer;
    public constructor( root:egret.DisplayObjectContainer ) {
        this._root = root;
    }

    private _row:number;
    private _rectRoot:egret.Sprite;
    private _rectGroup:Array<GroupRect>;
    private createGroupRect()
    {
        this._rectRoot = new egret.Sprite();
        this._root.addChild( this._rectRoot );
        
    }
}