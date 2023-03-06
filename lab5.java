//You are supposed to create a menu-driven program that can encrypt or decrypt a message that the user wishes to transfer.
//Your program should have two functions, one for encryption and another for decryption. Each function will accept a string message and return the encrypted or decrypted message.



//Draw a flow chart for your program and write the pseudocode before starting the coding in your observation notebook.

import java.util.Scanner;

public class lab5{
	static String encrpytion_message= "";

	static String encrpytion(String message, int key){
		char ch;
		for (int i=0; i<=message.length();++i){
			ch = message.charAt(i);
			
			if (ch>='a' && ch<='z'){
				ch = (char) (ch + key);
				
				if (ch > 'z'){
					ch = (char) (ch - 'z' + 'a' - 1);
				}
					encrpytion_message += ch;
			}
			else if (ch >='A' && ch <= 'Z'){
				ch = (char) (ch + key);
				
				if (ch > 'Z'){
					ch = (char) (ch - 'Z' + 'A' - 1);
				}
					encrpytion_message += ch;
			}
			else{
				encrpytion_message +=ch;
				System.out.println("encrypted_message =" + encrpytion_message);
			}
		}
			return encrpytion_message;
			
		}
		
		static String decryption(String encrpytion_message, int key):
				char ch ;
				decryption_message = "";
				 for(int i = 0; i < encrpytion_message.length(); ++i){
                    ch = message.charAt(i);
                    if(ch >= 'a' && ch <= 'z'){
                        ch = (char) (ch - key);

                        if(ch < 'a'){
                            ch = (char) (ch + 'z' - 'a' + 1);
                        }

                        decryption_message += ch;
                    }
                    else if(ch >= 'A' && ch <= 'Z'){
                        ch = (char) (ch - key);

                        if(ch < 'A'){
                            ch = (char) (ch + 'Z' - 'A' + 1);
                        }

                       decryption_message += ch;
                    }
                    else {
                        decryption_message += ch;
                    }
                }
                System.out.println("decryption_message = " + decryptedMessage);
                return decryptedMessage;
            }
		
			
		
	
	
	public static void main(String[] args){
		String message;
		int key;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the message you want to encryted");
		message = sc.nextLine();
		System.out.println("enter the key for message");
		key = Integer.parseInt(sc.nextLine());
		encrpytion(message,key);
		decryption(encrpytion_message,key);
		
	
	}
}