# Java Upskilling Roadmap 🛤️
This project have the main topics about java in order to knowledge-transfer KT for study the main projects
## ✅ Prerequisites for  a funniest terminal
### ☕ Java JDK
 - Download Java 24 from the official website:
   🔗[Descargar Java JDK 24](https://www.oracle.com/java/technologies/downloads/#jdk24-windows)

   - Once time downloaded, Add the path to the environment variable
     - ```JAVA_HOME = C:\Program Files\Java\jdk-24```

### 📦 Apache Maven
 - Download maven from the official website ⬇️:
  🔗 [Descargar Maven](https://maven.apache.org/)

   - Add the path to the environment variable
     - `PATH`:```C:\Program Files\Apache\Maven\apache-maven-3.9.11```
### 🌀 Zsh + Oh My Zsh Setup

💡 **This setup provides a powerful and interactive terminal experience inside IntelliJ, allowing you to run shell commands with style and Git integration.**

---

#### 🔧 Installation Steps

1. **Install MSYS2**  
   Download and install MSYS2 from the official website:  
   🔗 [https://www.msys2.org/#installation](https://www.msys2.org/#installation)

2. **Open the MSYS2 terminal** and run the following commands to update the package database and install the required tools:

   ```bash
   pacman -Syu                           # First full system update (may restart terminal)
   pacman -Su                            # Second update after restart (if needed)
   pacman -S mingw-w64-ucrt-x86_64-gcc   # Install GCC compiler
   pacman -S zsh                         # Install Zsh shell
   pacman -S git                         # Install Git (required for Oh My Zsh)
   pacman -S curl                        # Install Curl (used to download Oh My Zsh)
   ```
3. **Then, run the following command to install Oh My Zsh:**
    ```bash
    sh -c "$(curl -fsSL https://raw.githubusercontent.com/ohmyzsh/ohmyzsh/master/tools/install.sh)"
    ```
4. **Add in intellij the path to the MSYS2 compiler:**
    ```
    C:\Users\gsalv\msys64\usr\bin\zsh
    ```
5. **Configure the .zshrc file to add the path to the MSYS2 compiler:**
    ```
    # ===============================
    # systen path base MSYS2
    # ===============================
    export PATH="/usr/local/bin:/usr/bin:/bin:/mingw64/bin:$PATH"
    
    # ===============================
    # config de Java y Maven
    # ===============================
    export JAVA_HOME="/c/Program Files/Java/jdk-24"
    export MAVEN_HOME="/c/Program Files/Apache/Maven/apache-maven-3.9.11"
    export PATH="$JAVA_HOME/bin:$MAVEN_HOME/bin:$PATH"
    
    # ===============================
    # config  Oh My Zsh
    # ===============================
    export ZSH="$HOME/.oh-my-zsh"
    ZSH_THEME="robbyrussell"
    plugins=(git)
    
    source $ZSH/oh-my-zsh.sh
    
    # ===============================
    # others configs (optional)
    # ===============================
    
    # export LANG=en_US.UTF-8
    # export EDITOR=nano
    # alias ll='ls -lah'
    # alias gs='git status'
    ```

6. **For reload the .zshrc file, run the following command in the MSYS2 terminal:**
    ```bash
    source ~/.zshrc
    ``` 


### Built with 🌱 Spring Boot
   ```bash
      mvn clean install
   ``` 

if you want to run the project, you can use the following command:
  ```bash
    mvn spring-boot:run
  ```
## 👨‍💻🚀👨‍🚀💫🪐 Ready to Code!💫🪐👨‍🚀🚀👨‍💻



