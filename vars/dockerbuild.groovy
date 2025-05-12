// jenkins-shared-lib/vars/dockerbuild.groovy
def call(String imageName, String imageVersion) {
    sh "docker build -t ${imageName}:${imageVersion}"
}
