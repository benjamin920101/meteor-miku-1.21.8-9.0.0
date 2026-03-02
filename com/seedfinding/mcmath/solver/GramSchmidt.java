/*
 * Decompiled with CFR 0.152.
 */
package com.seedfinding.mcmath.solver;

import com.seedfinding.mcmath.arithmetic.Rational;
import com.seedfinding.mcmath.component.matrix.QMatrix;
import com.seedfinding.mcmath.component.vector.QVector;

public class GramSchmidt {
    public static void main(String[] args) {
        QMatrix m = new QMatrix(new QVector(4L, 3L), new QVector(-1L, 6L)).transpose();
        System.out.println(GramSchmidt.apply(m));
        System.out.println(m.getColumn(0).dot(m.getColumn(1)));
    }

    public static QMatrix apply(QMatrix matrix) {
        QMatrix result = new QMatrix(matrix.getRowCount(), matrix.getColumnCount(), (row, column) -> Rational.ZERO);
        for (int i = 0; i < matrix.getColumnCount(); ++i) {
            QVector w = matrix.getColumn(i).copy();
            for (int j = 0; j < i; ++j) {
                w.subtractAndSet(matrix.getColumn(i).projectOnto(result.getColumn(j)));
            }
            result.setColumn(i, w);
        }
        return result;
    }

    public static enum Phase {
        ORTHOGONAL,
        ORTHONORMAL;

    }
}

