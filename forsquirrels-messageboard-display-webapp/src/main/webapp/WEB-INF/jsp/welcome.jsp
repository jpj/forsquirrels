<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html
          PUBLIC "-//W3C//DTD XHTML 1.1//EN"
	  "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
  <head>
    <title>For Squirrels - Disenchanted: Message Board</title>
    <meta name="google-site-verification" content="fkVfjDYdz0ayoiCV8xpD_mY8b96spSQ6eKJb--7vdbU" />
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
    <meta name="description" content="For Squirrels | Disenchanted" />
    <meta name="author" content="Josh Johnson, http://www.solairis.com" />
    <meta name="generator" content="VIM: the Vi IMproved text editor
                                    SPM: the Solairis Page Manager
				              AND
			            LE Handler" />
    
    <base href="http://forsquirrels.net/"/>
    <link rel="stylesheet" type="text/css"
	  href="/static/fs.css"
	  title="FS" />
    <script type="text/javascript" src="/static/js/gen.js"></script>
  </head>
  <body>
    <table border="0" cellpadding="0" cellspacing="0" style="height:100%;">
      <tr>
        <td colspan="2" class="titlebar">
	<!--
	  <div class="t2">Disenchanted</div>
	  <div class="t1">For Squirrels</div>
	-->
	  <div class="t2" id="top">For Squirrels</div>
	</td>
      </tr>
      <tr>
        <td style="width:150px;height:100%;background-color:#cc6600;padding-left:5px;padding-bottom:5px;">
	  <h1>&nbsp;</h1>
	  <table border="0" cellpadding="0" cellspacing="0">

	    <tr>
	      <td id="main" class="navbar"

		  onmouseout="navbarOut('main');"
	          onmouseover="navbarHover('main');">

		<a href="/">Main</a>
              </td>
	    </tr>
	    <tr>
	      <td id="msgboard" class="navbar"

                  style="background-color:#ffffff;"
		  onmouseout="navbarOutSelected('msgboard');"
	          onmouseover="navbarHover('msgboard');">

                Msg Board
              </td>
	    </tr>
	    <tr>
	      <td id="bio" class="navbar"

		  onmouseout="navbarOut('bio');"
	          onmouseover="navbarHover('bio');">

		<a href="/bio.html">Bio</a>
              </td>
	    </tr>
	    <tr>
	      <td id="discography" class="navbar"

		  onmouseout="navbarOut('discography');"
	          onmouseover="navbarHover('discography');">

		<a href="/discography/">Discography</a>
              </td>
	    </tr>
	    <tr>
	      <td id="tablature" class="navbar"

		  onmouseout="navbarOut('tablature');"
	          onmouseover="navbarHover('tablature');">

		<a href="/tabs/">Tablature</a>
              </td>
	    </tr>
	    <tr>
	      <td id="lyrics" class="navbar"

		  onmouseout="navbarOut('lyrics');"
	          onmouseover="navbarHover('lyrics');">

		<a href="/lyrics/">Lyrics</a>
              </td>
	    </tr>
	    <tr>
	      <td id="mailinglist" class="navbar"

		  onmouseout="navbarOut('mailinglist');"
	          onmouseover="navbarHover('mailinglist');">

		<a href="/mailinglist.html">Mailing List</a>
              </td>
	    </tr>
	    <tr>
	      <td id="pictures" class="navbar"

		  onmouseout="navbarOut('pictures');"
	          onmouseover="navbarHover('pictures');">

		<a href="/pics.html">Pictures</a>
              </td>
	    </tr>
	    <tr>
	      <td id="downloads" class="navbar"

		  onmouseout="navbarOut('downloads');"
	          onmouseover="navbarHover('downloads');">

		<a href="/downloads/">Downloads</a>
              </td>
	    </tr>
	    <tr>
	      <td id="links" class="navbar"

		  onmouseout="navbarOut('links');"
	          onmouseover="navbarHover('links');">

		<a href="/links.html">Links</a>
              </td>
	    </tr>
	    <tr>
	      <td id="siteinfo" class="navbar"

		  onmouseout="navbarOut('siteinfo');"
	          onmouseover="navbarHover('siteinfo');">

		<a href="/about.html">Site Info</a>
              </td>
	    </tr>
	    <tr>
	      <td id="contact" class="navbar"

		  onmouseout="navbarOut('contact');"
	          onmouseover="navbarHover('contact');">

		<a href="/contact.html">Contact</a>
              </td>
	    </tr> 
          </table>
	</td>
        <td style="width:100%;padding-left:5px;">

	  <h1 class="pagehead">Message Board</h1>



    <p>
	<span style="border: 2px #000000 solid; padding-left: 25px; padding-right: 25px;">
      <a href="post.html">Post a new message</a>
	</span>
    </p>
	  
	  <c:forEach items="${messageThreads}" var="thread">
		  <div id="threadID_266" style="border: solid black 1px;margin-bottom:7px;">
			  <c:forEach items="${thread.posts}" var="post"  varStatus="postsStatus">
				  <div class="${postsStatus.index % 2 == 0 ? 'c2' : 'c1'}">
					  ${postsStatus.first ? '' : '-'}&gt;
					  
					  <a href="thread.html?id=266&amp;msg=3083#post_3083">${post.subject}</a>
					  Posted by: <b>${post.author}</b> on:
					  <i>${post.postDate}</i>
				  </div>
			  </c:forEach>
		  </div>
	  </c:forEach>
	  
	  
	  


    <p>
      <a href="post.html">Post a new message</a>
    </p>

          <p style="border-top:solid black 1px;">
	    &hearts;2001 - 2010
            <a href="http://www.solairis.com">Solairis</a>
            web designs.<br />
            Page last updated: <i>Sat Sep  8 23:16:39 2007</i><br />

	    DEBUG
            <a href="http://validator.w3.org/check?uri=referer">html</a>
	    <a href="http://jigsaw.w3.org/css-validator/validator?uri=http://www.forsquirrels.net/">css</a>
	    <a href="http://uptime.netcraft.com/up/graph?site=www.forsquirrels.net">uptime</a>.
	    MPG: <i>2.411503</i>,
	    Thread: <i>20003</i>
          </p>
        </td>
      </tr>
    </table>

  <script type="text/javascript">
var gaJsHost = (("https:" == document.location.protocol) ? "https://ssl." : "http://www.");
document.write(unescape("%3Cscript src='" + gaJsHost + "google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E"));
</script>
<script type="text/javascript">
try {
var pageTracker = _gat._getTracker("UA-12616011-2");
pageTracker._trackPageview();
} catch(err) {}</script></body>
</html>

