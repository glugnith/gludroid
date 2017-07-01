package com.nith.glug;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class show_info extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info_layout);
		
		RelativeLayout layout = (RelativeLayout) findViewById(R.id.info_layout);
		
		Intent in = getIntent();
		String head = in.getStringExtra("value");
		
		
		TextView text = (TextView) findViewById(R.id.head_os);
		text.setText(head);
		
		TextView text2 = (TextView) findViewById(R.id.content_os);
		
		TextView text3 = (TextView) findViewById(R.id.content_link);
		text3.setClickable(true);
		text3.setMovementMethod(LinkMovementMethod.getInstance());
		
		if(head.compareTo("Ubuntu")==0){
			text2.setText("Ubuntu is a Debian-based Linux operating system, with Unity as its default desktop environment" +
					" . It is based on free software and named after the Southern African philosophy of ubuntu which often is translated as" +
					" \"the belief in a universal bond of sharing that connects all humanity\". Ubuntu is the most popular desktop Linux distribution" +
							" to date. See Installed base section.\nDevelopment of Ubuntu is led by Canonical Ltd., a company owned by South African" +
							" entrepreneur Mark Shuttleworth. Canonical generates revenue through the sale of technical support and other services" +
							" related to Ubuntu. The Ubuntu project is publicly committed to the principles of open source development; people are" +
							" encouraged to use free software, study how it works, improve upon it, and distribute it.");
			String linking = "<a href='http://www.ubuntu.com'>Ubuntu Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		} else if(head.compareTo("Fedora")==0){
			text2.setText("Fedora (formerly Fedora Core) is an operating system based on the Linux kernel, developed by the community-supported" +
					" Fedora Project and owned by Red Hat. Fedora contains software distributed under a free and open source license and aims to be" +
					" on the leading edge of such technologies. Linus Torvalds, author of the Linux kernel, uses Fedora on all his computers.\n" +
					"Fedora has a reputation for focusing on innovation, integrating new technologies early on and working closely with upstream " +
					"Linux communities. Making changes upstream instead of specifically in Fedora ensures that the changes are available to all" +
					" Linux distributions.");
			String linking = "<a href='http://www.fedoraproject.org'>Fedora Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		} else if(head.compareTo("Kubuntu")==0){
			text2.setText("Kubuntu is an official derivative of the Ubuntu operating system which uses the KDE Plasma Desktop instead of " +
					"the Unity graphical environment. As part of the Ubuntu project, Kubuntu uses the same underlying systems, every package in " +
					"Kubuntu shares the same repositories as Ubuntu, and it is released regularly on the same schedule as Ubuntu. It is possible " +
					"to install both the KDE Plasma Desktop (kubuntu-desktop) and the Unity desktop (ubuntu-desktop) on the same machine. �Kubuntu�" +
					" is a registered trademark held by Canonical. It is derived from the name Ubuntu, prefixing a K to represent the KDE community " +
					"on whose platform Kubuntu is built.");
			String linking = "<a href='http://www.kubuntu.org'>Kubuntu Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		} else if(head.compareTo("Kali Linux")==0){
			text2.setText("Kali Linux is a Debian-derived Linux distribution designed for digital forensics and penetration testing. It is" +
					" maintained and funded by Offensive Security Ltd. It was developed by Mati Aharoni and Devon Kearns of Offensive Security " +
					"through the rewrite of BackTrack, their previous forensics Linux distribution.\nBackTrack was a Linux distribution, superseded" +
					" by Kali Linux, that focused on security based on the Ubuntu Linux distribution aimed at digital forensics and penetration" +
					" testing use. In March 2013, the Offensive Security team rebuilt BackTrack around the Debian distribution and released it under" +
					" the name Kali Linux.");
			String linking = "<a href='http://www.kali.org'>Kali Linux Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		}else if(head.compareTo("Debian")==0){
			text2.setText("Debian is an operating system which is composed primarily of free software, most of which is under the GNU General Public License," +
						" and developed by a group of individuals known as the Debian project. Debian is one of the most popular Linux distributions for" +
						" personal computers and network servers, and has been used as a base for several other Linux distributions." +
						" As one of the earliest Linux distributions, it was envisioned that Debian was to be developed openly in the spirit of Linux and GNU." +
						" This vision drew the attention and support of the Free Software Foundation, which sponsored the project for the first part of its life.");
			String linking = "<a href='http://www.debian.com'>Debian Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		}else if(head.compareTo("Slackware")==0){
			text2.setText("Slackware is a Linux distribution which has been the basis for many other Linux distributions, most notably the first versions of" +
						" SUSE Linux, and is the oldest currently being maintained. Slackware aims for design stability and simplicity and to be the most " +
						" Unix-like Linux distribution. It makes as few modifications as possible to software packages from upstream and tries not to " +
						" anticipate use cases or preclude user decisions. In contrast to most modern Linux distributions, Slackware provides no graphical" +
						" installation procedure and no automatic dependency resolution of software packages. It uses plain text files and only a small set of" +
						" shell scripts for configuration and administration. Without further modification it boots into a command-line interface environment. " +
						" Because of its many conservative and simplistic features, Slackware is considered to be most suitable for advanced and technically inclined" +
						" Linux users.");
			String linking = "<a href='http://www.slackware.com'>Slackware Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		}else if(head.compareTo("Gnome")==0){
			text2.setText("GNOME is a desktop environment which is composed entirely of free and open-source software and targets to be cross-platform, i.e. run on" +
						" multiple operating systems, its main focus being those based on the Linux kernel. GNOME is developed by The GNOME Project, which is composed" +
						" of both volunteers and paid contributors, the largest corporate contributor being Red Hat.It is an international project that aims to" +
						" develop software frameworks for the development of software, to program end-user applications based on these frameworks and coordinates the" + 
						" efforts for internationalization and localization as well as for accessibility of that software.");
			String linking = "<a href='http://www.gnome.org'>Gnome Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		}else if(head.compareTo("Linux Mint")==0){
			text2.setText("Linux Mint is a Linux distribution for desktop computers, based on either Ubuntu or Debian. Its stated aim is to be " +
					"a \"modern, elegant and comfortable operating system which is both powerful and easy to use.\" Mint provides full out-of-the" +
					"-box multimedia support by including some proprietary software such as Adobe Flash. Mint's motto is \"from freedom came" +
					" elegance\".");
			String linking = "<a href='http://www.linuxmint.com'>Linux Mint Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		}else if(head.compareTo("Backtrack")==0){
			text2.setText("BackTrack was a Linux distribution, superseded by Kali Linux, that focused on security based on the Ubuntu Linux" +
					" distribution aimed at digital forensics and penetration testing use.In March 2013, the Offensive Security team rebuilt" +
					" BackTrack around the Debian distribution and released it under the name Kali Linux.");
			String linking = "<a href='http://www.backtrack-linux.org'>Backtrack Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		} else if(head.compareTo("Gimp")==0){
			text2.setText("Just like sound editors, industry standard image editing software is prohibitively expensive for a lot of people, but" +
					" GIMP provides a free alternative. It performs every major function you could desire, except for, vitally, CMYK separation" +
					" functionality necessary for prepress work.");
			String linking = "<a href='http://www.gimp.org'>Gimp Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		}else if(head.compareTo("CentOS")==0){
			text2.setText("CentOS (abbreviated from Community Enterprise Operating System) is a Linux distribution that attempts to provide a free," +
					"enterprise-class, community-supported computing platform which aims to be 100% binary compatible with its upstream source, Red" +
					"Hat Enterprise Linux (RHEL). In January 2014, it was announced that CentOS was officially joining forces with Red Hat while staying" +
					"independent from RHEL, under a new CentOS Governing Board.");
			String linking = "<a href='http://www.centos.org'>CentOS Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		}else if(head.compareTo("Docky")==0){
			text2.setText("Docky is an advanced shortcut bar that sits at the edges of your screen. It provides easy access to some of the files," +
					" folders and applications on your computer, displays which applications are currently running, holds windows in their minimized state and more.");
			String linking = "<a href='http://www.go-docky.com'>Docky Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		}else if(head.compareTo("Vi/Vim")==0){
			text2.setText("Vim is a text editor written by Bram Moolenaar and first released publicly in 1991. Based on the ideas of the vi editor" +
					" common to Unix-like systems, Vim is designed for use both from a command-line interface and as a standalone application in a" +
					" graphical user interface. Vim is free and open source software and is released under a license that includes some charityware" +
					" clauses, encouraging users who enjoy the software to consider donating to children in Uganda.The license is compatible with the" +
					" GNU General Public License.");
			String linking = "<a href='http:// www.vim.org/'>Vim Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		}else if(head.compareTo("Wine")==0){
			text2.setText("Wine is a compatibility layer capable of running Windows applications on several POSIX-compliant operating systems, such as" +
					" Linux, Mac OSX, & BSD. Instead of simulating internal Windows logic like a virtual machine or emulator, Wine translates Windows" +
					" API calls into POSIX calls on-the-fly, eliminating the performance and memory penalties of other methods and allowing you to cleanly" +
					" integrate Windows applications into your desktop.");
			String linking = "<a href='http://www.winehq.org'>Wine Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		}else if(head.compareTo("Deepin")==0){
				text2.setText("Deepin is an Ubuntu-based distribution that aims to provide an elegant," +
					" user-friendly and reliable operating system. It does not only include the best the open source world has to offer, but it has" +
					" also created its own desktop environment called DDE or Deepin Desktop Environment which is based on HTML 5 technologies. Deepin" +
					" focuses much of its attention on intuitive design. Its home-grown applications, like Deepin Software Centre, DMusic and DPlayer" +
					" are tailored to the average user. Being easy to install and use, Deepin can be a good Windows alternative for office and home use. ");
				String linking = "<a href='http://www.linuxdeepin.com'>Deepin Official Site</a>";
				text3.setText(Html.fromHtml(linking));
		} else if(head.compareTo("VLC")==0){
			text2.setText("VLC media player had been downloaded 300 million times. Unlike some paid-for alternatives, VLC supports practically" +
					" every audio/video codec and file format. The most recent VLC release also offers live recording of streaming video," +
					" frame-by-frame advancement and superb speed controls.");
			String linking = "<a href='http://www.videolan.org/vlc/index.html'>VLC Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		}else if(head.compareTo("Chrome")==0){
			text2.setText("Google Chrome is a freeware web browser developed by Google. It used the WebKit layout engine until version 27 and," +
					" with the exception of its iOS releases, from version 28 and beyond uses the WebKit fork Blink.It was first released as a" +
					" beta version for Microsoft Windows on September 2, 2008, and as a stable public release on December 11, 2008. As of July" +
					" 2014, StatCounter estimates that Google Chrome has a 45% worldwide usage share of web browsers so this estimate indicates" +
					" it is the most widely used web browser in the world.");
			String linking = "<a href=' https://www.google.co.in/chrome/'>Chrome Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		} else if(head.compareTo("Mozilla Firefox")==0){
			text2.setText("Firefox currently accounts for 24.43% of the recorded usage share of web browsers, but this figure is on the rise." +
					" Already the browser of choice for most web professionals, Firefox�s popularity is growing thanks to its vast selection of " +
					"third party add-ons, which let users tailor their browsing environment down to the finest detail.");
			String linking = "<a href='http:// https://www.mozilla.org/firefox'>Mozilla Firefox Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		}else if(head.compareTo("ThunderBird")==0){
			text2.setText("With its speedy searches, built-in RSS feeds, strong security and superb add-ons, Thunderbird has to be the best, free " +
					"email application available. If you�re prepared to spend some time tailoring your email environment with add-ons, you�ll " +
					"absolutely love it, but it�s probably not ideal for complete novices.");
			String linking = "<a href='https://www.mozilla.org/thunderbird/'>ThunderBird Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		}else if(head.compareTo("FileZilla")==0){
			text2.setText("FileZilla is a hugely successful, cross-platform FTP client. It�s also available as a server, for Windows only. Created " +
					"in January 2001 by Tim Klosse as a class project, FileZilla has gone on to become the 5th most popular download of all time " +
					"from SourceForge.net.");
			String linking = "<a href='https://filezilla-project.org/'>FileZilla Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		}else if(head.compareTo("Audacity")==0){
			text2.setText("Audacity is a free, cross-platform sound editor. Users can record and edit live audio; cut, copy, splice and mix sounds;" +
					"and convert ageing tapes and records into digital format.");
			String linking = "<a href='http://audacity.sourceforge.net/'>Audacity Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		}else if(head.compareTo("Open Office")==0){
			text2.setText("With the ability to create text documents, spreadsheets, presentations and databases, OpenOffice is an accomplished rival to" +
					"Microsoft Office, which clearly influenced OpenOffice�s design. Microsoft Office users will feel completely at home and find that" +
					"  OpenOffice performs just as well, if not better.");
			String linking = "<a href=' https://www.openoffice.org/'>Open Office Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		}else if(head.compareTo("Blender")==0){
			text2.setText("Blender is a 3D content creation suite which can be used for everything from modeling to skinning, particle simulation," +
					" animating and texturing. Unlike some other free apps in this list, Blender has not been designed to �imitate� other 3D graphics " +
					"software, which means it takes a bit of getting used ");
			String linking = "<a href='http://www.blender.org'>Blender Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		}else if(head.compareTo("Damn Small Linux")==0){
			text2.setText("Damn Small is small enough and smart enough to do the following things:" +
						"Boot from a business card CD as a live linux distribution (LiveCD)" +
						"Boot from a USB pen drive" +
						"Boot from within a host operating system (that's right, it can run *inside* Windows)" +
						"Run very nicely from an IDE Compact Flash drive via a method we call frugal install" + 
						"Transform into a Debian OS with a traditional hard drive install" +
						"Run light enough to power a 486DX with 16MB of Ram" +
						"Run fully in RAM with as little as 128MB (you will be amazed at how fast your computer can be!)" +
						"Modularly grow -- DSL is highly extendable without the need to customize");
			String linking="<a href='http://www.damnsmalllinux.org/'>DSL Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		}else if(head.compareTo("Puppy Linux")==0){
			text2.setText("Easily install to USB, Zip or hard drive media." +
							"Booting from CD (or DVD), the CD drive is then free for other purposes." +
							"Booting from CD (or DVD), save everything back to the CD." +
							"Booting from USB Flash drive, minimise writes to extend life indefinitely." +
							"Extremely friendly for Linux newbies." +
							"Boot up and run extraordinarily fast." +
							"Have all the applications needed for daily use." +
							"Will just work, no hassles." +
							"Will breathe new life into old PCs" +
							"Load and run totally in RAM for diskless thin stations");
			String linking="<a href='http://www.puppylinux.org/'>Puppy Linux Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		}else if(head.compareTo("Elementary OS")==0){
			text2.setText("elementary OS is a Linux distribution based on Ubuntu. It makes use of a desktop" +
							"with its own shell named Pantheon,[2] and is deeply integrated with other elementary" +
							"OS applications like Plank (a dock), Midori (the default web browser) and Scratch (a simple text editor)." +
							"This distribution uses Gala as its window manager,[3] which is based on Mutter.[2]");
			String linking="<a href=http://www.elementaryos.org/''>Elementary Official Site</a>";
			text3.setText(Html.fromHtml(linking));
		} else{
			text2.setText("Connection to Server failed.");
		}
		
		
	}
}
