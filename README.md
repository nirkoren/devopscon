# 🌟 Welcome to DevOpsCon CI/CD Demo Repo

This repository contains a basic **Maven project** with a **Hello-World Java WAR** file used during the **CI/CD workshop**.

Please follow the setup instructions below to get everything running correctly.

---

> ⚠️ **IMPORTANT**  
> Make sure you have **JAVA 21 (JDK — *not* JRE standalone)** installed on your machine.  
> ——————————————————————————

---

## 🚀 Setup Instructions

### 1️⃣ Download & Prepare Tomcat  
- Download **Tomcat 9** (not version 10).  
  Choose: **Core → ZIP**  
  👉 <a href="https://tomcat.apache.org/download-90.cgi" target="new">Tomcat 9 Download Page</a>

---

### 2️⃣ Add User Configuration  
Edit:  
`<TOMCAT DIR>/conf/tomcat-users.xml`  
Insert the following:

```xml
<tomcat-users>
  <role rolename="manager-gui" />
  <role rolename="admin-gui" />
  <role rolename="manager-script" />
  <user username="admin" password="admin" roles="manager-gui,admin-gui,manager-script" />
</tomcat-users>
