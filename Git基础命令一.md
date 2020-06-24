## Git基础命令

* Show what's changed but not yet staged

  展示改变但是没有提交

  **git diff**

* Rename main.txt to file.txt

  把main改名为file

  **git mv main.txt file.txt**

* Initialize a repository

  初始化git库

  **git init**

* Pull data from remote "develop" without merging

  在不合并的情况下从远程“develop"分支提取数据

  **git fetch develop**

* Stage files and commit

   ***不知道具体含义***

  **git commit -a**

* Create tracking branch 'fix2' based off origin

  在origin的基础上创建分支fix2

  **git checkout --track origin/fix2**

* Create new branch feature

  **git branch feature**

* Push develop branch to remote staging master

  *推送develop分支到master上*

  **git push staging develop:master**

* Create branch "feature2" and switch to it

  *创建分支，并切换到此分支*

  **git checkout -b feature2**

* Show last commit on all branches

  *所有分支最后一次提交*

  **git branch -v**

* Force delete branch "fix" that is not yet merged

  *强制删除未合并的分支fix*

  **git branch -D fix**

* Show branches already merged into current branch

  ***暂未知功能***

  **git branch --merged**

* Push local branch "feature1" to origin

  *将本地分支f推送到远程origin*

  **git push origin feature1**

* Delet remote branch "fix2" from origin

  *从origin删除fix2分支*

  **git push origin:fix2**

* Push master branch to origin server

  *把主分支推送到远程origin服务商*

  **git push origin master**

* Show branch not yet merged into current branch

  *展示至今没有合并到现在分支的分支*

  **git branch --no-merged**

* Delete branch "mybranch"

  *删除分支*

  **git branch -d mybranch**

* Show current branches

  **git branch**

* Switch to branch 'master'

  **git checkout master**

  