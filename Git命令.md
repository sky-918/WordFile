## Git命令

##### 新建分支

1) 切换到基础分支，如主干

git checkout master

2）创建并切换到新分支

git checkout -b panda

git branch可以看到已经在panda分支上

3） 推到远程

 git push origin panda 

4）创建本地分支并拉取远程分支

git checkout -b  local_dev  origin/remote_dev

##### 删除分支

1. 查看所有分支

   git branch -a

2. 查看当前所在分支

   git branch

3. 删除本地的bug_xzx分支

   git branch -d bug_xzx

4. 删除远程的bug_xzx分支

   git push origin --delete bug_xzx

5. git查看某个分支的创建者以及创建时间

   git for-each-ref --format='%(committerdate) %09 %(authorname) %09 %(refname)' | sort -k5n -k2M -k3n -k4n|grep **androidx_master**

