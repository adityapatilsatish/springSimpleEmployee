This is a demo project create to impliment the Springboot with Hibernate and Jpa using a MYSQL db

Implimented 

Created a Product entity class to store the Product.

Created Employee and Commission entity, Commission entity is the sub entity an employee can have multiple commission records.

** @onetomany is used to link Employee and Commision

eg:    @OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="epmployeId",referencedColumnName = "epmployeId")
private List<CommisionEmp> commissions;



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

