package com.gforce.route.sapling.enforcebyte;

import javassist.*;

import java.io.IOException;

/**
 * @author tianyuan14
 * @create 2019/9/16 8:52 PM
 */
public class JavassistTest {
    public static void main(String[] args) throws NotFoundException, CannotCompileException, IllegalAccessException, InstantiationException, IOException {
        ClassPool cp = ClassPool.getDefault();
        CtClass cc = cp.get("/Users/gforce/test/sapling/src/main/java/com/gforce/route/sapling/enforcebyte/Base.java");
        CtMethod m = cc.getDeclaredMethod("process");
        m.insertBefore("{ System.out.println(\"start\"); }");
        m.insertAfter("{ System.out.println(\"end\"); }");
        Class c = cc.toClass();
        cc.writeFile("");
        Base h = (Base)c.newInstance();
        h.process();
    }
}
