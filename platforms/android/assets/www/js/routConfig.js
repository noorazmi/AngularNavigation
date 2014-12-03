myapp.config(function($stateProvider, $urlRouterProvider){
      
      // For any unmatched url, send to /route1
	
//	$urlRouterProvider.otherwise(function($injector,$location){
//		console.log('Screen URL fetched is:********************************** ');
//    	cordova.exec(function(screenUrl){
//    	    console.log('Screen URL fetched is: '+screenUrl);
//    		$location.path(screenUrl).replace();
//    	}, function(){
//    		console.log('Unable to fetch Screen Url*********************************');
//    	}, 'NativeHybridCommPlugin', 'SCREEN_URL', []);	
//    });
	
	
	
     // $urlRouterProvider.otherwise("/route1")
    
	
	
	
	$urlRouterProvider.otherwise('page2');
	
	
	 $stateProvider
     .state('page2', {
         url: "/page2",
         templateUrl: "partials/page2.html"
     })
	
      $stateProvider
        .state('route1', {
            url: "/route1",
            templateUrl: "partials/route1.html"
        })
        .state('route1.list', {
              url: "/list",
              templateUrl: "partials/route1.list.html",
              controller: function($scope){
                $scope.items = ["A", "List", "Of", "Items"];
              }
          })
          
        .state('route2', {
            url: "/route2",
            templateUrl: "partials/route2.html"
        })
        .state('route2.list', {
              url: "/list",
              templateUrl: "partials/route2.list.html",
              controller: function($scope){
                $scope.things = ["A", "Set", "Of", "Things"];
              }
         });
});