package com.alagaskaxu.git;

public class GitTest {
    public static void main(String[] args) {
        System.out.println("hello git");
        System.out.println("hello git2");
        System.out.println("hello git3");
        System.out.println("hello git4merge");//建议用rebase来合并分支

    }
}
//这里注意一下：IDEA 实现版本切换回看的功能，并不是使用的 reset
//reset 这种方式会直接把 HEAD 以及 MASTER 一起拉回那个版本，
// 并且会丢失目标版本之后的内容，
//IDEA 使用的是 git checkout <commit> 的方式进行的版本切换
//<commit>为版本号，这种方式会让 HEAD 处于游离状态
//它底层是创建了一个临时的匿名分支
//恢复 HEAD 的方式就是用 git switch master  或者 git checkout master
// 就可以回最初版本
//再切回来的时候，它会使用 git branch -d <branch-name> 的删除命令，
// 再把临时创建的那个仅供回看目的的分支给删除掉