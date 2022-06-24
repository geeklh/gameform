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


// 一个是动作都包含在function里面

// $(function() {
//     $('#btn').on('touchstart', function(){
//         alert('hello zepto')
//     })
//     $(".formbutton").click(function () {
//         $(".form").toggle(2000);
//     })
// })