class Data {
    private static _rectWidth:number = 0;
    // 小方块的大小会根据操作界面变化
    public static getRectWidth():number
    {
        if( Data._rectWidth == 0) {
            Data._rectWidth = Data.getStageWidth() /4;
        }
        return Data._rectWidth;
    }

    // 分数 在一定时间内点击的方块数量
    public static score:number = 0;
    // 行数
    private static _rectRow:number = 0;
    public static getRectRow():number
    {
        if( Data._rectRow == 0) {
            Data._rectRow  = Math.ceil(  Data.getStageHeight() / Data.getRectWidth() ) + 1;
        }
        return Data._rectRow;
    }

    public static getStageWidth():number
    {
        return egret.MainContext.instance.stage.stageWidth;
    }
    public static getStageHeight():number
    {
        return egret.MainContext.instance.stage.stageHeight;
    }
}