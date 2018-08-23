/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;

/**
 *
 * @author Nurlybek
 */
public class Trie {
    static final int ALPHABET_SIZE = 26;
    
    static class TrieNode
    {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
        boolean isEndOfWord;         
        TrieNode(){
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }
    };
      
    static TrieNode root;      

    static void insert(String key)
    {
        int level;
        int length = key.length();
        int index;
      
        TrieNode trie = root;
      
        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';
            if (trie.children[index] == null)
                trie.children[index] = new TrieNode();      
            trie = trie.children[index];
        }
      
        trie.isEndOfWord = true;
    }
      
    static boolean search(String key)
    {
        int level;
        int length = key.length();
        int index;
        TrieNode trie = root;
      
        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';      
            if (trie.children[index] == null)
                return false;      
            trie = trie.children[index];
        }
      
        return (trie != null && trie.isEndOfWord);
    }
      
    public static void main(String args[])
    {
        
        String keys[] = {"the", "a", "there", "answer", "any", "by", "bye", "their"};
      
        String output[] = {"Not present in trie", "Present in trie"};      
        System.out.println("Words in trie:");
        for (String key : keys) {
            System.out.print(key+" ");
        }
        System.out.println("");
        root = new TrieNode();
        int i;
        for (i = 0; i < keys.length ; i++)
            insert(keys[i]);
      
        if(search("the") == true)
            System.out.println("the - " + output[1]);
        else 
            System.out.println("the - " + output[0]);
         
        if(search("a") == true)
            System.out.println("a - " + output[1]);
        else 
            System.out.println("a - " + output[0]);
         
        if(search("their") == true)
            System.out.println("their - " + output[1]);
        else
            System.out.println("their - " + output[0]);
         
        if(search("ans") == true)
            System.out.println("ans - " + output[1]);
        else 
            System.out.println("ans - " + output[0]);        
    }
}