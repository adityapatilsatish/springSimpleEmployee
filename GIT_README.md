-------------------------------------------------------------

** Created a new git repo and ran the below commands **
** To create a new repo and push to git run the below commands**

echo "# springSimpleEmployee" >> README.md

git init

git add README.md

git commit -m "first commit"

git branch -M main

git remote add origin https://github.com/adityapatilsatish/springSimpleEmployee.git

git push -u origin main

-------------------------------------------------------------

To create a new branch 

Come out of current branch : git checkout <Current branch>
Create a new one : git checkout -b <New branch name> 

Make and save your code changes in this new branch. Use git add to stage your changes and git commit to commit them.

Stage mean telling git which files are changes and needs to be saved.

git add .

git commit -m "Your commit message"

Push the New Branch to Your Repository

git push -u origin <new_branch_name>

------------------------------------------------

To merge the changes in branches say master and feature

Make sure your master and feature branches are up to date with the latest changes from the remote repository. You can use the following commands
# Switch to the master branch
git checkout master

# Pull the latest changes from the remote master branch
git pull origin master

# Switch to the feature branch
git checkout feature

# Pull the latest changes from the remote feature branch
git pull origin feature

Create a new branch from main where you'll combine the changes from master and feature. Use the following command:
git checkout -b main-combined main


First, merge the changes from the master branch into the main-combined branch:
git merge master

This command merges the changes from master into the main-combined branch.

Next, merge the changes from the feature branch into the main-combined branch:
git merge feature

Resolve Any Merge Conflicts
Once you've successfully combined the changes from master and feature into the main-combined branch, you can push these changes to the remote repository:
git push origin main-combined

Create a Pull Request 

------------------------------------------------------------

To check status of current:

git status

------------------------------------------------------------

To sync code from git repo/branch to local

Make sure you're on the branch you want to sync:
git checkout your-branch-name

Fetch the latest changes from the remote repository to ensure you have the most up-to-date information about the branch:
git fetch

Merge the changes from the remote branch into your local branch. You can do this using the git merge command, or if you prefer a non-fast-forward merge, you can use git pull. For a standard merge, use:
git merge origin/your-branch-name

For a non-fast-forward merge (creating a merge commit), you can use:
git pull origin your-branch-name

Resolve any merge conflicts, if they occur. Git will automatically attempt to merge changes, but if it encounters conflicting changes, you will need to resolve them manually. Open the conflicted files, edit them to your satisfaction, and then use git add to mark them as resolved. After resolving all conflicts, commit the changes.

Push the merged changes back to the remote repository if necessary:
git push origin your-branch-name

-------------------------------------------------------------
