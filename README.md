# 知行校园APP项目

### 如何运行

##### 服务端

确保当前文件路径为Server文件夹

执行mvn install 或使用图像化界面安装所需依赖

运行程序

wsm wsm dev

程序将执行在9090端口

##### 应用端

确保已安装Android SDK环境，或按照[此处](https://reactnative.cn/docs/environment-setup)配置环境

确保已连接一个虚拟机或实体设备，可使用 adb devices 命令查看

确保当前文件路径为ZhingxingCampusApp文件夹

执行npm install 安装所需依赖

依赖安装完毕后执行npx react-native run-android

程序将被安装至adb连接的设备中
