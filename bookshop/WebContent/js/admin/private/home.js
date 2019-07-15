/**
 * 主頁的JS
 */

(function () {
	"use strict";

	var treeviewMenu = $('.app-menu');

	// Toggle Sidebar
	$('[data-toggle="sidebar"]').click(function(event) {
		event.preventDefault();
		$('.app').toggleClass('sidenav-toggled');
	});

	// Activate sidebar treeview toggle
	$("[data-toggle='treeview']").click(function(event) {
		event.preventDefault();
		if(!$(this).parent().hasClass('is-expanded')) {
			treeviewMenu.find("[data-toggle='treeview']").parent().removeClass('is-expanded');
		}
		$(this).parent().toggleClass('is-expanded');
	});

	// Set initial active toggle
	$("[data-toggle='treeview.'].is-expanded").parent().toggleClass('is-expanded');

	//Activate bootstrip tooltips
	$("[data-toggle='tooltip']").tooltip();

})();

function navTo(url)
{
	location.href=url;
}


/*
===================================教师Bar统计图=============================
*/
// 基于准备好的dom，初始化echarts实例
var teacherBarChart = echarts.init(document.getElementById('teacherBarId'));
// 指定图表的配置项和数据
teacherBarOption = {
    title: {text: ''},
   
    color: ['#003366', '#006699', '#4cabce', '#e5323e', 'green'],
    tooltip: {},
    legend: {
        data: ['教授', '副教授', '讲师', '助教', '素质老师']
    },
    toolbox: {},
    xAxis: [
        {
            type: 'category',
            axisTick: {show: false},
            data: ['软件工程团队', '数据科学团队', '系办公室']
        }
    ],
    yAxis: [
        {
            type: 'value'
        }
    ],
    series: [
        {
            name: '教授',
            type: 'bar',
            barGap: 0,
            data: [2, 1, 2]
        },
        {
            name: '副教授',
            type: 'bar',
            data: [6, 4, 1]
        },
        {
            name: '讲师',
            type: 'bar',
            data: [5, 5, 1]
        },
        {
            name: '助教',
            type: 'bar',
            data: [1, 2, 0]
        },
        {
            name: '素质老师',
            type: 'bar',
            data: [6, 4, 0]
        }
    ]
};

// 使用刚指定的配置项和数据显示图表。
teacherBarChart.setOption(teacherBarOption);


 /*
===================================教师pie统计图=============================
*/
// 基于准备好的dom，初始化echarts实例
var teacherPieChart = echarts.init(document.getElementById('teacherPieId'));
// 指定图表的配置项和数据
teacherPieOption = {
    title : {
        text: '教师成份',
        subtext: '',
        x:'center'
    },
    tooltip : {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },
    legend: {
        orient: 'vertical',
        left: 'left',
        data: ['教授','副教授','讲师','助教','素质老师']
    },
    series : [
        {
            name: '教师成份',
            type: 'pie',
            radius : '60%',
            center: ['50%', '60%'],
            data:[
                {value:4, name:'教授'},
                {value:25, name:'副教授'},
                {value:10, name:'讲师'},
                {value:4, name:'助教'},
                {value:15, name:'素质老师'}
            ],
            itemStyle: {
                emphasis: {
                    shadowBlur: 10,
                    shadowOffsetX: 0,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        }
    ]
};
// 使用刚指定的配置项和数据显示图表。
teacherPieChart.setOption(teacherPieOption);


 /*
===================================学生Bar统计图=============================
*/
// 基于准备好的dom，初始化echarts实例
var studentBarChart = echarts.init(document.getElementById('studentBarId'));
// 指定图表的配置项和数据
studentBarOption = {
    title: {text: ''},
   
    color: ['#003366', '#006699', '#4cabce', '#e5323e'],
    tooltip: {},
    legend: {
        data: ['一本', '二本', '三本', '专科']
    },
    toolbox: {},
    xAxis: [
        {
            type: 'category',
            axisTick: {show: false},
            data: ['软件工程团队', '数据科学团队']
        }
    ],
    yAxis: [
        {
            type: 'value'
        }
    ],
    series: [
        {
            name: '一本',
            type: 'bar',
            barGap: 0,
            data: [120, 0]
        },
        {
            name: '二本',
            type: 'bar',
            data: [180, 300]
        },
        {
            name: '三本',
            type: 'bar',
            data: [100, 100]
        },
        {
            name: '专科',
            type: 'bar',
            data: [200, 0]
        }
    ]
};

// 使用刚指定的配置项和数据显示图表。
studentBarChart.setOption(studentBarOption);


 /*
===================================教师pie统计图=============================
*/
// 基于准备好的dom，初始化echarts实例
var studentPieChart = echarts.init(document.getElementById('studentPieId'));
// 指定图表的配置项和数据
studentPieOption = {
    title : {
        text: '学生成份',
        subtext: '',
        x:'center'
    },
    tooltip : {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },
    legend: {
        orient: 'vertical',
        left: 'left',
        data: ['一本', '二本', '三本', '专科']
    },
    series : [
        {
            name: '学生成份',
            type: 'pie',
            radius : '60%',
            center: ['50%', '60%'],
            data:[
                {value:120, name:'一本'},
                {value:180, name:'二本'},
                {value:100, name:'三本'},
                {value:100, name:'专科'}
            ],
            itemStyle: {
                emphasis: {
                    shadowBlur: 10,
                    shadowOffsetX: 0,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        }
    ]
};
// 使用刚指定的配置项和数据显示图表。
studentPieChart.setOption(studentPieOption);