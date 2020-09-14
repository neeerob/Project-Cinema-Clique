import java.lang.*;
import java.util.Scanner;


public class Start
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		Admin ad = new Admin();
		Account a= new Account();
		
		System.out.println("-----------------------------------");
		System.out.println("Welcome to Cinema Clique");
		System.out.println("-----------------------------------\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. REGISTER");
			System.out.println("\t2. LOGIN");
			System.out.println("\t3. ADMIN");
			System.out.println("\t4. EXIT");
			System.out.println("-----------------------------------\n");
			
			System.out.print("Enter Your Choice: ");
			int choice = sc.nextInt();
			System.out.println("-----------------------------------");
			
			switch(choice)
			{
				case 1:
				{
					System.out.println("---------------------------------");
					System.out.println("You Choose to Register");
					System.out.println("---------------------------------");
					
					System.out.print("Enter your full name : ");
					String name = sc.next();
					
					System.out.print("Enter an username : ");
					String userName = sc.next();
					
					System.out.print("Enter E-mail address : ");
					String email = sc.next();
					
					System.out.print("Enter your phone number : ");
					String phnNo = sc.next();
					
					System.out.print("Enter a password : ");
					String pass = sc.next();
					
					System.out.print("Confirm password : ");
					String cPass = sc.next();
					
					a = new Account(name, userName, email, phnNo, pass, cPass);
					
					if(ad.insertUser(a))
					{
						System.out.println("Thank you for registering to Project Cinema Clique!");
						System.out.println("Please Log in to continue.");
					}
					else
					{
						System.out.println("Registration Failed!!!");
					}
					
					
					break;
				}
				
				case 2:
				{
					System.out.print("Enter Username : ");
					String userName1 = sc.next();
					
					System.out.print("Enter Password : ");
					String userPass1 = sc.next();
					
					if(userName1.equals(a.getUserUserName()) && userPass1.equals(a.getUserPassWord()))
					{
						System.out.println("login Successfull!!");
						System.out.println("What do you want to do?");
						System.out.println("\t1. MOVIES");
						System.out.println("\t2. SHOW TIME");
						System.out.println("\t3. TICKET PRICE");
						System.out.println("\t4. ABOUT US");
						System.out.println("-----------------------------------\n");
						
						int choice1 = sc.nextInt();
						
						switch(choice1)
						{
							case 1:
							{
								break;
							}
							
							case 2: 
							{
								break;
							}
							
							case 3:
							{
								break;
							}
							
							case 4:
							{
								break;
							}
							default :
							{
								System.out.println("No Such Option!!");
							}
						}
						
					}
					else
					{
						System.out.println("login failed!! Wrong Username or Pasword!!");
					}
					
					break;
					
				}
				
				case 3:
				{
					System.out.println("Project Cinema Clique");
					
					System.out.print("Enter Your Admin ID : ");
					String adminid = sc.next();
					
					System.out.print("Enter Password : ");
					String adminP = sc.next();
					
					if(adminid.equals(ad.adminId) && adminP.equals(ad.adminPassword))
					{
						System.out.println("login Successfull!!");
						System.out.println("What do you want to do?");
						System.out.println("\t1. MOVIE LIST(ADD/DELETE)");
						System.out.println("\t2. USER LIST (ACCOUNT INFORMATION)");
						
						int choice2 = sc.nextInt();
						
						switch(choice2)
						{
							case 1:
							{	
								System.out.println("What do you want to do?");
								System.out.println("\t1.ADD MOVIE");
								System.out.println("\t2.DELETE MOVIE");
								
								int choice4 = sc.nextInt();
								
								switch(choice4)
								{
									case 1:
									{
										System.out.print("Enter Movie name : ");
										String mName = sc.next();
					
										System.out.print("Enter Director's name : ");
										String dName = sc.next();
					
										System.out.print("Enter Story : ");
										String mStory = sc.next();
					
										System.out.print("Enter Duration : ");
										String dur = sc.next();
										
										Movies m1 = new Movies(mName, dName, mStory, dur);
										
										if(ad.insertMovie(m1))
										{
											System.out.println("A new movie "+m1.getMovie()+" has been added to the list.");
										}
										else
										{
											System.out.println("Movie was not added!!");
										}
					
										
										break;
									}
									
									case 2:
									{
										System.out.println("---------------------------------");
										System.out.println("You Choose to Remove An Movie");
										System.out.println("---------------------------------");
							
										System.out.print("Enter an Movie Name to Remove: ");
										String mov = sc.next();
							
										Movies m3 = ad.searchMovie(mov);
							
										if(m3 != null)
											{
												if(ad.deleteMovie(m3)){ System.out.println("Movie Removed with name "+m3.getMovie());}
												else{System.out.println("Movie Can Not be Removed......");}
											}
											else
											{
												System.out.println("Movie Does Not Exist");
											}
										break;
									}
									
									default :
									{
										System.out.println("No Such Option!!");
									}
								}
								break;
							}
							
							case 2: 
							{
								ad.showAllUser();
								break;
							}
							
							default :
							{
								System.out.println("No Such Option!!");
							}
						}
						
						
					}
					
					break;
				}
				
				case 4:
				{
					System.exit(0);
					break;
				}
				
				default:
				{
					System.out.println("No Such Option!!");
				}
			}
			
		}
		
		
	}
}
