# 读书笔记

# 环境搭建（最重要）

*X86*就是一般用的32位的系统,*X64*就是64位的系统

## C编译器

Windows下可以使用MinGW（Minimalist GNU for Windows）。

http://www.mingw.org/download.shtml

## cygwin或MSYS

http://www.cygwin.com/

http://www.mingw.org/download.shtml

## bison

http://gnuwin32.sourceforge.net/packages/bison.htm

## flex

http://gnuwin32.sourceforge.net/packages/flex.htm

## 参考连接

https://www.ituring.com.cn/article/198247

https://blog.csdn.net/lcxhappy2004/article/details/80079073?utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-1.control&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-1.control



centos 上

```
yum -y install gcc

 yum -y install gcc-c++
 
 yum install byacc
yum install flex

```

yacc --version

flex --version

cc --version

https://www.cnblogs.com/lyc94620/p/13201379.html

方案一：
[hi@hi ~]# yum -y install http://mirror.centos.org/centos-7/7.7.1908/cloud/x86_64/openstack-queens/oniguruma-6.7.0-1.el7.x86_64.rpm
[hi@hi ~]# yum -y install http://mirror.centos.org/centos-7/7.7.1908/cloud/x86_64/openstack-queens/oniguruma-devel-6.7.0-1.el7.x86_64.rpm

方案二：
[hi@hi ~]# yum -y install http://down.24kplus.com/linux/oniguruma/oniguruma-6.7.0-1.el7.x86_64.rpm
[hi@hi ~]# yum -y install http://down.24kplus.com/linux/oniguruma/oniguruma-devel-6.7.0-1.el7.x86_64.rpm

