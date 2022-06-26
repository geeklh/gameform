// 两种写法
// 一个是触发的动作分开写
$(".formbutton").click(function () {
    $(".form").toggle(2000);
})

$('#btn').on('touchstart', function(){
    alert('hello zepto')
})

var arr = [1,2,3];
// 数组操作
$(function(){
    $.each(arr , function(index , item){
        // console.log($.isArray(arr))
        console.log(index , item)
    })
    $('#dis').hide();
    $('.box1').on('touchstart', function(){
        $('.box1').append('<p>我是新添加的元素</p>')
    })
    $('.box3').on('touchstart', function () {
        $(this).find('p').css('background', 'red');
    })
    $('.box2').on('touchstart', function () {
        $('#dis').show();
    })
})

// 人物对话实现
$(function() {
    $('.box2').on('touchstart', function() {
        $('.first').show();
    })
})

$(function(){
    // 初始化数据
    var direction = {up:1, right:2, down:3, left:4};
    // 初始化两个坐标
    var now = {col: 1, row: 1};//横向坐标 纵向坐标
    var last = {col: 0, row: 0};

    // 滑动事件
    // 向上滑动
    $('.page').swipeUp(function () {
        movePage(direction.up);
    })
    // 向下滑动
    // 向左滑动
    // 向右滑动
    // 定义滑动函数
    function movePage(dir){
        // 初始化参与动画的页面
        var lastPage = '.page-' + last.col + '-' + last.row;
        var nowPage = '.page-' + now.col + '-' + now.row;
        console.log(nowPage, lastPage);
        // 初始化两个动画类
        var inClass = '';//进场的动画类
        var outClass = '';//出场的动画类
        // 匹配方向
        switch (dir){
            case direction.up:
                outClass = 'pt-page-moveToTop';
                inClass = 'pt-page-moveFromBottom';
                break;
            case direction.right:
                outClass = 'pt-page-moveToRight';
                inClass = 'pt-page-moveFromLeft';
                break;
            case direction.down:
                outClass = 'pt-page-moveToBottom';
                inClass = 'pt-page-moveFromUp';
                break;
            case direction.left:
                outClass = 'pt-page-moveToLeft';
                inClass = 'pt-page-moveFromRight';
                break;
        }
        // 将动画类加到对应的/参与动画的=》页面上
        $(lastPage).addClass(outClass);
        $(nowPage).removeClass('hide');
        $(nowPage).addClass(inClass);
    }
    
})


// 一个是动作都包含在function里面

// $(function() {
//     $('#btn').on('touchstart', function(){
//         alert('hello zepto')
//     })
//     $(".formbutton").click(function () {
//         $(".form").toggle(2000);
//     })
// })