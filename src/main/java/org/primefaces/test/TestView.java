package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Data;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {

    private TreeNode<TestObject> tableData;

    public TreeNode<TestObject> getTableData() {
        return tableData;
    }

    @PostConstruct
    public void init() {
        TreeNode<TestObject> root = new DefaultTreeNode<TestObject>(null, null);
        TreeNode<TestObject> node1 = new DefaultTreeNode<TestObject>(new TestObject("Node 1"), root);
        TreeNode<TestObject> node1_1 = new DefaultTreeNode<TestObject>(new TestObject("Node 1.1"), node1);
        TreeNode<TestObject> node1_2 = new DefaultTreeNode<TestObject>(new TestObject("Node 1.2"), node1);
        TreeNode<TestObject> node2 = new DefaultTreeNode<TestObject>(new TestObject("Node 2"), root);
        TreeNode<TestObject> node2_1 = new DefaultTreeNode<TestObject>(new TestObject("Node 2.1"), node2);
        TreeNode<TestObject> node2_2 = new DefaultTreeNode<TestObject>(new TestObject("Node 2.2"), node2);
        tableData = root;
    }
}
