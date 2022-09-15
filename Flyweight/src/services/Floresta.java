/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import factory.abs.ArvoreFactory;
import factory.model.Arvore;
import factory.action.ArvoreTipo;
import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 * @author gmuniz
 */
public class Floresta extends JFrame {
    private List<Arvore> trees;

    public Floresta() {
        this.trees = new ArrayList<>();
    }

    public void plantarArvore(int x, int y, String name, Color color, String otherTreeData) {
        ArvoreTipo type = ArvoreFactory.getTreeType(name, color, otherTreeData);
        Arvore tree = new Arvore(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        trees.forEach(tree -> {
            tree.desenhar(graphics); 
        });
    }
}