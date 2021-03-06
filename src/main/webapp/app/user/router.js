define(['user/module',
        'user/manager/listCtrl',
        'user/manager/detailCtrl',
        'user/role/ctrl',
        'user/audit/ctrl'
        ], function(userModule) {
	return userModule.config(function($stateProvider) {
		$stateProvider
		.state('user', {
			'abstract' : 'true',
			url : '/user',
			template : '<div ui-view></div>'
		})
		.state('user.list', {
			url : '/list',
			templateUrl : 'app/user/manager/list.html',
			controller : 'UserListCtrl as ctrl'
		})
		.state('user.detail', {
			url : '/detail/{id}',
			templateUrl : 'app/user/manager/detail.html',
			controller : 'UserDetailCtrl as ctrl'
		})
		.state('user.addUser', {
			url : '/addUser',
			templateUrl : 'app/user/manager/addUser.html',
			controller : 'AddUserCtrl as ctrl'
		})
		.state('user.role', {
			url : '/role',
			templateUrl : 'app/user/role/role.html',
			controller : 'RoleAllocationCtrl as ctrl'
		})
		.state('user.audit', {
			'abstract' : 'true',
			url : '/audit',
			template : '<div ui-view></div>',
		})
		.state('user.audit.list', {
			url : '/list',
			templateUrl : 'app/user/audit/list.html',
			controller : 'UserAuditListCtrl as ctrl'
		})
		.state('user.audit.detail', {
			url : '/detail/id/{id}/revision/{revision}',
			templateUrl : 'app/user/audit/detail.html',
			controller : 'UserAuditDetailCtrl as ctrl'
		})
		;
	});
});