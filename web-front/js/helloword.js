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
        console.log('向上滑动', now.col, now.row);
        // 计算滑动之后lastpage的坐标
        last.col = now.col;
        last.row = now.row;
        if(last.col < 5) {
            // 计算滑动之后进场页面的坐标
            now.col = last.col + 1;
            now.row = last.row;
            movePage(direction.up);
        }
        
    })
    // 向下滑动
    $('.page').swipeDown(function () {
        console.log('向下滑动', now.col, now.row)
        last.col = now.col;
        last.row = now.row;
        if(last.col > 1) {
            now.col = last.col - 1;
            now.row = last.row;
            movePage(direction.down);
        }
    })
    // 向左滑动
    $('.page').swipeLeft(function() {
        console.log('向左滑动', now.col, now.row);
        last.col = now.col;
        last.row = now.row;
        if(last.col > 1 && last.col < 5 && last.row == 1){
            now.col = last.col;
            now.row = last.row + 1;
            movePage(direction.left);
        }
    })
    // 向右滑动
    $('.page').swipeRight(function() {
        console.log('向右滑动', now.col, now.row);
        last.col = now.col;
        last.row = now.row;
        if(last.col > 1 && last.col < 5 && last.row == 2){
            now.col = last.col;
            now.row = last.row - 1;
            movePage(direction.right);
        }
    })
    
    // 定义滑动函数
    function movePage(dir){
        // 初始化参与动画的页面
        var lastPage = '.page-' + last.col + '-' + last.row;
        var nowPage = '.page-' + now.col + '-' + now.row;
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

        // 动画执行完 清除动画类 收尾工作
        setTimeout(() => {
            $(lastPage).removeClass(outClass);
            $(lastPage).addClass('hide');
            $(lastPage).removeClass('page-current');
            $(nowPage).removeClass(inClass);
            $(nowPage).addClass('page-current');
        }, 600);
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