## Adding project to your github
1. git init
2. git add .
3. git commit -m "initial commit"
4. git remote add origin {repo https link}
5. git push origin {branch name}  
   If 5 not working run 6
7. git push origin {branch name} --force
<br><br>
- Checking all branches - git branch  
- Creating a new branch - git branch {new branch name}  
- Switch to new branch - git checkout {branch name}  
- Remove the remote origin - git remote remove origin  
- Verify removal - git remote -v  
- Re-adding a remote origin - git remote add origin {repo https link}  



## Cloning a project from github
git clone {repo https link}

## Docker commands
- docker-compose up -->	Starts all services in docker-compose.yml   
- docker-compose down --> 	Stops and removes all containers   
- docker-compose up --build --> 	Rebuilds images before starting   
- docker ps -->  	Shows running containers   
- docker exec -it <container_name> bash	-->    Opens shell in a running container
