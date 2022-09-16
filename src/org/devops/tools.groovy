package org.devops

//带颜色打印信息
def PrintMsg(content, color) {
    colors = ['red'   : "\033[40;31m >>>>>>>>>>>${content}<<<<<<<<<<< \033[0m",
              'blue'  : "\033[47;34m ${content} \033[0m",
              'green' : "\033[40;32m >>>>>>>>>>>${content}<<<<<<<<<<< \033[0m" ]
    ansiColor('xterm') {
        println(colors[color])
    }
}

// 获取时间
def getTime() {
    return new Date().format('yyyy-MM-ddHHmmss')
}

// 获取jenkins工作路径
def getJenkinsHome(){
	return "${JENKINS_HOME}";
}
