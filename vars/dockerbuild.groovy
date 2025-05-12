def call(string imageName, string ImageVersion){
  sh "docker build -t ${imageName}:${imageVersion}
  
}
