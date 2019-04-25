# treeCmp

TreeCmp: comparison of trees in polynomial time. See the [manual](TreeCmp_manual.pdf) for usage.

## Compilation from the command line

Normally, compilation is done via an IDE like NetBeans or Eclipse

To compile via the command-line, creating files in the directory `out/class`, you should be able to do the 
following from the top level folder

```
javac -d out/class -cp lib/commons-cli-1.4.jar src/treecmp/*.java src/treecmp/*/*.java src/pal/*/*.java
```

The resulting compiled files can be run directly, for example by issuing the command
`java -cp out/class:lib/commons-cli-1.4.jar treecmp.Main`
(you will need to replace the colon with a semicolon on windows systems). However, it is usually easier to create a stand-alone .jar executable.

## Creating a jar executable from the command line

The jar executable is built to expect the commons-cli-1.4.jar library in a `lib` directory in the same
place as the jar file, and the file `config.xml` file in a  `config` directory one level above. A simple way to 
create such a structure is to create a top level directory named `bin`, and to copy the `lib` folder there.
On unix systems this can be done as follows

```
mkdir bin; cp -a lib bin/
```

A jar file named `TreeCmp.jar` can then be created in the `bin` directory by using the supplied MANIFEST.MF file
in `src/META-INF`, as follows

```
jar cvfm bin/TreeCmp.jar src/META-INF/MANIFEST.MF -C out/class/ .
```

The `TreeCmp.jar` file can then be run as described in the [manual](TreeCmp_manual.pdf) (e.g. 
`java -jar bin/TreeCmp.jar -w 2 -d ms -i examples/beast/testBSP.newick -o testBSP.newick_w_2.out -I`
