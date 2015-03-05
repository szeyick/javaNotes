# Java Notes
This repository contains general notes and code snippets for Java. 

<p>
"Write once, run anywhere" is the general motto that accompanies Java. The idea of it being that because of the Java Virtual Machine that the program runs on, the generated <b>bytecode</b> from the users code should run the same regardless of the hardware. This is different to C/C++ where the compiled binaries may run on any machine after manually debugging it on the hosting platform. A program written in Java is useful when its intention is to be run on multiple machines. 
</p>
<h2>Overview</h2>
<p>
To achieve cross platform compatibility, Java code is compiled into bytecode instead of machine specific code. This bytecode is designed to be interpreted and executed by the Java Virtual Machine (JVM). Whilst the Java application and its compiled bytecode is designed to be run regardless of the hardware, the JVM is written specifically for the machine that it is on, meaning that the JVM is platform dependant but not the users application. 
</p>
<p>
Because the program is interpreted by the JVM rather than the host machine, it is generally considered to be slower in runtime compared to languages like C/C++ where they generate binaries to be run directly by the host. Java introduced the concept of JIT (Just in Time) compilers to convert the bytecode to machine code at run time to speed up execution. The compiled byte code is represented in the .class files, and is the file that contains the instructions that the JVM interprets. 
</p>
<p>
The JVM provides a small sandbox or isolated environment for an application to run in. It therefore in some respects can protect the host machine from possible malicious activity. In addition, crashes in the application will not cause the host machine to crash as well. The Java language and bytecode do not need to go hand in hand, meaning that an application written in Java does not neccessarily need to be compiled into bytecode as it can also be compiled into machine code if desired.
</p>
<p>
The idea behind this repository is to provide tips and hints about the Java language and useful information about the inner workings of the language and how it interacts with the JVM.
</p>
