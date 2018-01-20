<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<!--[if IE 6]>
<html id="ie6" dir="ltr" lang="en-US">
<![endif]-->
<!--[if IE 7]>
<html id="ie7" dir="ltr" lang="en-US">
<![endif]-->
<!--[if IE 8]>
<html id="ie8" dir="ltr" lang="en-US">
<![endif]-->
<!--[if !(IE 6) | !(IE 7) | !(IE 8)  ]><!-->
<html dir="ltr" lang="en-US">
    <!--<![endif]-->
    <head>
        
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width" />
        
        <title>Open Wallet - Probably the best online shop</title>
        
        <!-- [favicon] begin -->
        <link rel="shortcut icon" type="image/x-icon" href="images/favicon.ico" />
        <link rel="icon" type="image/x-icon" href="images/favicon.ico" />
        <!-- [favicon] end --> 
        
        <!-- CSS Main -->
        <link rel="stylesheet" type="text/css" media="all" href="css/reset.css" />
        <link rel="stylesheet" type="text/css" media="all" href="style.css" />
        <link rel="stylesheet" type="text/css" media="screen and (max-width: 960px)" href="css/lessthen960.css" />
        <link rel="stylesheet" type="text/css" media="screen and (max-width: 600px)" href="css/lessthen600.css" />
        <link rel="stylesheet" type="text/css" media="screen and (max-width: 480px)" href="css/lessthen480.css" />
        <link rel="stylesheet" type="text/css" media="all" href="css/memento.css"  />
        
        <!-- CSS Plugin -->
        <link rel="stylesheet" href="css/prettyPhoto.css" type="text/css" media="all" />
        <link rel="stylesheet" href="css/tipsy.css" type="text/css" media="all" />
        <link rel='stylesheet' href='css/buttons.min.css' type='text/css' media='all' />
		<link rel='stylesheet' href='css/labels.min.css' type='text/css' media='all' />
		<link rel='stylesheet' href='css/wells.min.css' type='text/css' media='all' />
        
        <!-- CSS Slider -->
        <link rel="stylesheet" href="css/slider-thumbnails.css" type="text/css" media="all" />
        
        <link rel="stylesheet" type="text/css" media="all" href="css/homes/home.css" />
        

        <!-- FONTS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Droid+Sans&amp;subset=latin%2Ccyrillic%2Cgreek&amp;ver=3.4.1" type="text/css" media="all" />
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Shadows+Into+Light&amp;subset=latin%2Ccyrillic%2Cgreek&amp;ver=3.4.1" type="text/css" media="all" />
                <link rel='stylesheet' href='css/font-awesome.css' type='text/css' media='all' />
        <link rel='stylesheet' href='fonts/socialico/stylesheet.css' type='text/css' media='all' />
        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed%3A300%7CPlayfair+Display%3A400italic&#038;ver=3.4.1' type='text/css' media='all' />
        
        <!-- JavaScripts -->
        <script type="text/javascript">
            var yiw_prettyphoto_style = 'pp_default';
        </script>
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/jquery.cycle.min.js"></script>
        <script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
        <script type="text/javascript" src="js/jquery.prettyPhoto.js"></script>
        <script type="text/javascript" src="js/jquery.tipsy.js"></script>
        <script type="text/javascript" src="js/jquery.tweetable.js"></script>
        <script type="text/javascript" src="js/jquery.nivo.slider.pack.js"></script>
        <script type="text/javascript" src="js/jquery.flexslider.min.js"></script>
        <script type="text/javascript" src="js/jquery.aw-showcase.js"></script>
        <script type="text/javascript" src="js/superfish.js"></script>
        <script type='text/javascript' src="js/jquery.eislideshow.js"></script>
        <script type='text/javascript' src="js/swfobject.js"></script>
        <script type='text/javascript' src='js/jquery.cookie.js'></script>
        <script type='text/javascript' src='js/buttons.min.js'></script>
        <script type='text/javascript' src='js/layerslider.kreaturamedia.jquery-min.js'></script>
        <script type='text/javascript' src='js/jquery.quicksand.js'></script>
        
        <link rel="stylesheet" type="text/css" media="all" href="bootstrap.min.css" />
        <script type='text/javascript' src='js/bootstrap.min.js'></script>
        
        <style>
        div.loginDiv{
            position: absolute; 
            left: 0;
            top:0;
            bottom: 0;
            right: 0;
            max-height: 100%;
            max-width: 100%;
            margin: 0 auto;
        }
        table.loginTable{
            font-size: 16px;
            table-layout: fixed;
        }
        table.loginTable td{
            font-style: bold;
        }
        table.loginTable input{
            border: 1px solid #DEDEDE;
            width: 213px;
            height: 36px;
            font-size: 14px;
        }
        table.loginTable button{
            width: 170px;
            height: 36px;
            border-radius: 2px;
            color: white;
            background-color: #C40000;
            border-width: 0px;
        }
        td.loginTip{
            font-weight: bold;
        }
        td.loginTableLeftTD{
            width: 300px;
            text-align: right;
            font-style: bold;
        }
        td.loginTableRightTD{
            width: 300px;
            text-align: left;
            font-style: bold;
        }
        td.loginButtonTD{
            text-align: center;
        }
        h5 {
            color: white;
        }
        h2 {
            color: white;
            font-size: 40px;
        }
</style>
    </head>
    <body class="no_js responsive boxed-layout chrome ">
        <div class="loginDiv" align="center">
            <h2>OpenWallet</h2>
            <form method="post" action="forelogin">
    <table align="center" class="loginTable">
        <tbody><tr>
            <td style="font-size : 20px;" class="loginTip loginTableLeftTD">Sign in</td>
            <td></td>
        </tr>
        <tr>
            <td class="loginTableLeftTD">Email</td>
            <td class="loginTableRightTD" ><input type="email" name="email" id="email"></td>
        </tr>     
        <tr>
            <a href="forgotpassword.html">Forgot your password?</a>
            <td class="loginTableLeftTD">Password</td>
            <td class="loginTableRightTD"><input type="password" name="password" id="password"> </td>
        </tr>
        <tr>
            <td class="loginButtonTD" colspan="2">
                <a href="forelogin"><button>Sign in</button></a>
            </td>
        </tr>   
        <tr>
            <td colspan="2">
                <h4>New to OpenWallet? </h4>
                <a href="register.jsp">Create your OpenWallet account</a>            
            </td>
        </tr>
        <tr>
			<td colspan="2">
				<h4>Wanna go back home page? >><a href="home.jsp" style="color: black;">Go back home</a></h4>
			</td>
		</tr>             
        
    </tbody></table>
</form>
</div>
<script type="text/javascript">

  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-36516261-21']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

</script>       
    </body>
            
</html>