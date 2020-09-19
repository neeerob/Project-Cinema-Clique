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

					if(pass.equals(cPass))
					{
						System.out.println("Password and confirm password matced");
					}
					else
					{
						System.out.println("Registration Failed!!!");
						System.out.println("Password and confirm password do not match!! \n Try Again!");
						break;
					}
					
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
						System.out.println("\t5  Logout");
						System.out.println("-----------------------------------\n");
						
						int choice1 = sc.nextInt();
						
						switch(choice1)
						{
							case 1:
							{
								System.out.println("---------------------------------");
								System.out.println("Movies Lists Are given bellow");
								System.out.println("---------------------------------");
								ad.showAllMovies();


								break;
							}
							
							case 2: 
							{
								System.out.println("---------------------------------");
								System.out.println("Show Time");
								System.out.println("---------------------------------");
								ad.showTicketPricing();
								System.out.println("Enter movie name that ticket you want to purchase: ");
								String mov = sc.next();	
								Movies m4 = ad.searchMovie(mov);

								String dimention2d = "2d";
								 String dimention2D = "2D";
								 String dimention3D = "3D";
								 String dimention3d = "3d";

											if(m4 != null)
											{
												System.out.println("Movie Found with name : "+m4.getMovie());
												System.out.println("Movie Director : "+m4.getDirector());
												System.out.println("Movie Story : "+m4.getStory());
												System.out.println("Movie Duration : "+m4.getDuration());
												System.out.println("Time : " + m4.getTime() + m4.getAmOrPm());
												if(m4.getDimention().equals(dimention2D) || m4.getDimention().equals(dimention2d))
												{
												
												System.out.println("Movies Dimention : 2D");
												System.out.println("Movies Price : 450 $"  );
												
												}
												if(m4.getDimention().equals(dimention3D) || m4.getDimention().equals(dimention3d))
												{
												
												System.out.println("Movies Dimention : 3D");
												System.out.println("Movies Price : 550 $" );
												
												}


													System.out.print("Enter VISA/AMEX/MASTERCARD : ");
													String visaCard = sc.next();
					
													System.out.print("Enter Number behind card : ");
													String numberBehindCard = sc.next();
					
													System.out.print("Enter user name : ");
													String userName = sc.next();
					
													System.out.print("Enter Duration : ");
													String pin = sc.next();

													Payment payment1 = new Payment(visaCard,userName,numberBehindCard,pin);

													System.out.println("You purches movie name : "+m4.getMovie());

													System.out.print("THANK YOU FOR PURCHASING FROM PROJECT CINEMA CLIQUE!!");
													break;

											}
											else
											{
												System.out.println("Movie Does Not Exist");
												System.out.println("--------------------");

											}

								//purches
										
								
								break;
							}
							
							case 3:
							{
								System.out.println("---------------------------------");
								System.out.println("Movies Lists and ticket price ");
								System.out.println("---------------------------------");
								ad.showTicketPricing();
								break;
							}
							
							case 4:
							{
								System.out.println("Address: \n B#314, JAMUNA CITY, Chowdhury Bhaban (3rd Floor), Bashundhara, Dhaka, Bangladesh");
								
								System.out.println("Head Office:");
								System.out.println("Romiul Bhaban (Ground Floor), Gazipur, Benapole Bazar, Benapole");
								break;
							}
							case 5:
							System.out.println("Loging out!!");
							break;

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

										System.out.print("2D/3D Movie ");
										String dimen = sc.next();

										System.out.print("Enter Time : ");
										String time = sc.next();

										System.out.print("Am/Pm : ");
										String amOrPm = sc.next();

										String am = "am";
										String Am = "Am";
										String pm = "pm";
										String Pm = "Pm";
										if(amOrPm.equals(am) || amOrPm.equals(Am) || amOrPm.equals(pm) || amOrPm.equals(Pm))
										{
											Movies m1 = new Movies(mName, dName, mStory, dur,dimen,time,amOrPm);
										
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
										else
										{
											System.out.println("You type wrong keyword! Type Am or Pm!");
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
