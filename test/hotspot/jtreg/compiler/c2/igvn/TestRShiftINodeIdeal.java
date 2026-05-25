/*
 * Copyright (c) 2026, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package compiler.c2.igvn;

/*
 * @test
 * @bug 8385093
 * @summary Test that IGVN revisits RShiftI when a LoadUS input becomes unique.
 * @requires vm.debug == true & vm.compiler2.enabled
 * @run main/othervm -XX:+UnlockDiagnosticVMOptions
 *                   -Xcomp
 *                   -XX:CompileCommand=compileonly,compiler.c2.igvn.Test_105_Class_7::*
 *                   -XX:VerifyIterativeGVN=1110
 *                   compiler.c2.igvn.TestRShiftINodeIdeal
 */

final class Test_105_Class_0 {
    char var_3 = (char)(byte)(0.962762F * java.lang.Character.valueOf('@'));
    static float var_4 = 1.0F;
    static float var_5;

    public Test_105_Class_0() {
        float var_157 = +-0.5747422F;
        switch (java.lang.Double.valueOf(0.0).shortValue()) {
            case (short)-1527:
                var_4 %= java.lang.Float.valueOf(-0.0F);
            {
                final int var_195 = 437094741 * -131070;
                byte var_196 = (byte)125;
                var_157 /= 36028797018963970L;
                var_5 = var_195;
                long var_200 = -2199023255552L;
                var_200 |= -1152921504606846976L;
                short var_201 = (short)-128;
                var_200 -= java.lang.Float.valueOf(0.0F);
                var_200 >>>= -2097161;
            }
            {
                byte var_203 = (byte)-69;
                var_4 *= java.lang.Integer.valueOf(-356538438);
                double var_204 = 0.8543680133642562 % java.lang.Character.valueOf('@');
            }
            case (byte)-18:
            case (short)-2047:
                if (true) {
                    var_5 = (short)6475;
                }
                double var_211 = -2251799813685233L * 3.7400285033051473E-121;
                var_157 += 1.0008402240107104;
                if (true) {
                    final int var_212 = java.lang.Character.valueOf('@') * java.lang.Byte.valueOf((byte)-56);
                    var_4 += var_211;
                }
                if (true) {
                    final double var_215 = -0.30059930634469834 % java.lang.Float.valueOf(0.9990804F);
                    double var_216 = 32767 - var_215;
                }
                if (false) {
                } else {
                    float var_219 = java.lang.Byte.valueOf((byte)-15) - -0.22564691F;
                    final long var_220 = +(129L * java.lang.Byte.valueOf((byte)-1));
                    var_219 += java.lang.Integer.valueOf(-33554444);
                }
                var_4 /= java.lang.Long.valueOf(65551L);
            case (byte)-64:
            case (byte)-4:
                var_157 %= java.lang.Long.valueOf(-137438953486L);
            case (short)-2:
        }
    }
}

class Test_105_Value_Class_1 {
    final short var_260 = (short)new Test_105_Class_0().var_3;
}

class Test_105_Class_7 {
    static int var_349 = 0;
    static short var_354 = new Test_105_Value_Class_1().var_260;

    public Test_105_Class_7() {
        var_349 &= new Test_105_Value_Class_1().var_260;
    }
}

public class TestRShiftINodeIdeal {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Test_105_Class_7();
        }
    }
}
