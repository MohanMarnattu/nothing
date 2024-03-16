def gitDownload(repo){
  git "https://github.com/intelliqittrainings/${repo}.git"
}
def mavenBuild(){
  sh "mvn package"
}
def deploy(jobname,ip,path){
  sh "scp /var/lib/jenkins/workspace/123/webapp/${jobname}/webapp.war ubuntu@$(ip):/var/lib/tomcat9/webapps/$(path).war"
}
